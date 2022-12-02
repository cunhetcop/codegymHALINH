class Product {
    constructor(id,name,img,price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
    }
}

let product1 = new Product(1, "Ny Cũ Phong", "https://bilico.vn/wp-content/uploads/2020/08/mac-bikini-chup-anh-o-be-boi-vo-cuc.jpg", 200);
let product2 = new Product(2, "Ny Mới  Phong", "https://vcdn1-ngoisao.vnecdn.net/2018/09/12/1-6623-1536721878.jpg?w=0&h=0&q=100&dpr=2&fit=crop&s=VUyxNH-nWwvVVLAgmqcMBg", 200);
let products = [product1, product2];


function show() {
    let str = "";
    for (let i = 0; i < products.length; i++) {
        str +=`<tr>
                 <td>${products[i].id}</td>
                 <td>${products[i].name}</td>
                 <td>${products[i].price}</td>
                 <td><img src="${products[i].img}" width="200" height="150"></td>
                 <td><button type="button" onclick="showEdit(`+i+`)" class="btn btn-warning" data-toggle="modal" data-target="#ModalEdit">Edit</button></td>
                 <td><button type="button" onclick="deleteProduct(`+i+`)"  class="btn btn-danger">Delete</button></td>
             </tr>`
    }
    document.getElementById("show").innerHTML = str;
}
show();

function deleteProduct(id) {
    products.splice(id, 1);
    show()
}

function showEdit(i) {

        document.getElementById("id1").value = products[i].id;
        document.getElementById("name1").value = products[i].name;
        document.getElementById("img1").value = products[i].img;
        document.getElementById("price1").value = products[i].price;
}

function getProductById(id){
    for (let i = 0; i < products.length; i++) {
        if (products[i].id == id) {
            return products[i];
        }
    }
}

function edit(id){
    getProductById(id).id=document.getElementById("id1").value;
    getProductById(id).name=document.getElementById("name1").value;
    getProductById(id).img=document.getElementById("img1").value;
    getProductById(id).price=document.getElementById("price1").value;
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