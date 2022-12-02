class Product{
  constructor(id,name,img,price) {
    this.id = id;
    this.name = name;
    this.img = img;
    this.price = price;
  }
}
let product1= new Product(1,"Phong Đz vcl","https://image.lag.vn/upload/news/21/04/09/3_KJKJ.jpeg",20000);
let product2= new Product(2,"Phong Đz vcl","https://image.lag.vn/upload/news/21/04/09/3_KJKJ.jpeg",20000);
let products = [product1,product2];
function show(){
  let str = "";
  for (let i = 0; i < products.length; i++) {
    str += `<tr>
<td>${products[i].id}</td>
<td>${products[i].name}</td>
<td><img src="${products[i].img}" width="200px" height="250px"></td>
<td>${products[i].price}</td>
<td> <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModaledit" onclick="sendEdit(`+i+`)">Edit</button></td>
<td><button type="button" class="btn btn-info" onclick="deleteProduct(`+i+`)">Delete</button></td>


</tr>`
  }
  document.getElementById("show").innerHTML = str;
}
show();

function deleteProduct(i) {
  products.splice(i,1);
  show();
}

function create() {
  let id = document.getElementById("id").value;
  let name = document.getElementById("name").value;
  let img = document.getElementById("img").value;
  let price = document.getElementById("price").value;
  products.push(new Product(id,name,img,price));
  show();
}
function  edit(id){

  function getProductById(id){
    for (let i = 0; i < products.length; i++) {
      if (products[i].id == id) {
        return products[i];
      }
    }
  }
  getProductById(id).id=document.getElementById("id1").value;
  getProductById(id).name=document.getElementById("name1").value;
  getProductById(id).img=document.getElementById("img1").value;
  getProductById(id).price=document.getElementById("price1").value;
  show();

}

function sendEdit(i) {

  document.getElementById("id1").value    =    products[i].id;
  document.getElementById("name1").value= products[i].name;
  document.getElementById("img1").value= products[i].img;
  document.getElementById("price1").value= products[i].price;
}
