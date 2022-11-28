package gauna_albornoz.venta_d_camisetas.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gauna_albornoz.venta_d_camisetas.Models.Camisetas;
import gauna_albornoz.venta_d_camisetas.Repositories.CamisetasRepository;

@RestController
@RequestMapping("")
public class CamisetasController {
  @Autowired
  private CamisetasRepository camiseRepository;

  @PostMapping("/add") 
  public String addNewCamiseta(@RequestParam String club,@RequestParam String tipo, @RequestParam Long precio,@RequestParam Long stock) {

    Camisetas producto = new Camisetas();
    producto.setid(club);
    producto.settipo(tipo);
    producto.setprecio(precio);
    producto.setstock(stock);
    camiseRepository.save(producto);
    return "Producto guardado";
  }

  @PostMapping("/delete/{id}") // Map ONLY POST Requests
  public String deleteUserById(@PathVariable Long id) {
    // @RequestParam means it is a parameter from the GET or POST request

    camiseRepository.deleteById(id);
    return "Producto borrado";
    
  }

  @GetMapping("/{id}")
  public String findUserById(@PathVariable Long id) {
    /*Dentro del estilo, el selector #users indica que el estilo
     * que estamos definiendo es para ser usado solamente en el
     * elemento del DOM que tiene id='users', o sea la tabla.
     */
    String resp = """
      <style>
      h1{
        color: black;
        font-size: 50px;
        text-align: center;
        font-family: sans-serif;
      }
      body{
        background-image: url(https://images6.alphacoders.com/550/550393.jpg);
        background-repeat: no-repeat;
        background-position: center, center;
        background-size: 1660px  900px;
        background-attachment: fixed;
      }
        #users {
        font-family: Arial, Helvetica, sans-serif;
        
        width: 100%;
      }
      #users td, #users th {
        border: 1px solid #ddd;
        padding: 8px;
      }
      #users tr:nth-child(even){background-color: #f2f2f2;}
      #users tr:hover {background-color: #ddd;}
      #users th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #03116d;
        color: white;
      }
    </style>
    
      <header>
          <h1>Productos<h1>
      <header>
      <div>

      <table id='users'>
      <tr>
        <th>Id</th>
        <th>Club</th>
        <th>Tipo</th>
        <th>Precio</th>
        <th>Stock</th>
      </tr>
  """;
    if (camiseRepository.findById(id).isPresent()) {
      
      Camisetas user = camiseRepository.findById(id).get();
      resp += "<tr>"
          + "<td>" + user.getid() + "</td>"
          + "<td>" + user.getclub() + "</td>"
          + "<td>" + user.gettipo() + "</td>"
          + "<td>" + user.getprecio() + "</td>"
          + "<td>" + user.getstock() + "</td>"
          + "</tr>";
    } else {
      resp += "<tr>"
          + "<td>" + "-" + "</td>"
          + "<td>" + "-" + "</td>"
          + "<td>" + "-" + "</td>"
          + "<td>" + "-" + "</td>"
          + "<td>" + "-" + "</td>"
          + "</tr>";

    }
    return resp + "</table>";
  }
  @GetMapping("/all")
  public String getAllProductos() {
    // This returns a JSON or XML with the users
    Iterable<Camisetas> iterable = camiseRepository.findAll();
    String resp = """
          <style>
            h1{
              color: black;
              font-size: 50px;
              text-align: center;
              font-family: sans-serif;
            }
           
            body{
              background-image: url(https://images6.alphacoders.com/550/550393.jpg);
              background-repeat: no-repeat;
              background-position: center, center;
              background-size: 1660px  900px;
              background-attachment: fixed;
            }
              #users {
              font-family: Arial, Helvetica, sans-serif;
              blackground-color: #ffffff;
              width: 100%;
            }
            #users td, #users th {
              border: 2px solid #000;
              padding: 10px;
              
            }
            #users tr:nth-child(n){background-color: #ffffffe0;} 
            #users tr:hover {background-color: #f2f2f2;}
            #users th {
              padding-top: 12px;
              padding-bottom: 12px;
              text-align: left;
              background-color: #03116d;
              color: white;
            }
          </style>
          
            <header>
                <h1>Productos<h1>
            <header>
            <div>

            <table id='users'>
            <tr>
              <th>Id</th>
              <th>Club</th>
              <th>Tipo</th>
              <th>Precio</th>
              <th>Stock</th>
            </tr>
        """;
    
    for (Camisetas user : iterable) {
      resp += "<tr>"
        + "<td>" + user.getid() + "</td>"
        + "<td>" + user.getclub() + "</td>"
        + "<td>" + user.gettipo() + "</td>"
        + "<td>" + user.getprecio() + "</td>"
        + "<td>" + user.getstock() + "</td>"
        + "</tr>";
    }
    return resp + "</table>";
  }
  @GetMapping("")
  public String bienvenida() {
  String resp = """

    <style>
    h2{
      color: white;
      font-size: 50px;
      text-align: center;
      font-family: sans-serif;
    }
    body{
        background-image: url(https://s32679.pcdn.co/wp-content/uploads/2022/07/BIC_soccer_football_1280x720-04.png.webp);
        background-repeat: no-repeat;
        background-position: center, center;
        background-size: cover;
        background-attachment: fixed;
    }
    nav{
        max-width: 900px;
        margin: auto;
        background-color: rgb(45, 111, 211);
        font-size: 20px;
        margin-top: 50px;

    }


    .Menu-horizontal{
        list-style: none;
        display: flex;
        justify-content: space-around;
    }
    .Menu-horizontal > li > a{
        display: black;
        padding: 15px 20px;
        color: rgb(255, 255, 255);
        text-decoration: none;
    }

    .Menu-horizontal > li:hover{
        background-color: rgb(124, 167, 231);
    }

    .Menu-vertical{
        position: absolute;
        display: none;
        list-style: none;
        width: 446px;
        background-color: rgba(0,0,0,.5);
    }
    .Menu-horizontal li:hover .Menu-vertical{
        display: block;

    }
    .Menu-vertical li:hover{
        background-color: rgb(0, 0, 0);
    }
    .Menu-vertical li a{
        display: block;
        color: rgb(255, 255, 255);
        padding: 15px 15px 15px 20px;
        text-decoration: none;

    } </style>
          <<body>
          <header>
                  <h2 class='logo-img'>Venta de Camisetas</h2>
                  <link href = 

              </div>
              <nav>
                  <ul class='Menu-horizontal'>
                      <li>
                          <a href=''>Opciones</a>
                          <ul class='Menu-vertical'>
                              <li><a href='http://localhost:8080/all'>Productos</a></li>
                          </ul>
                      </li>
                  </ul>

              </nav>

          </header>
      </body>

            """;
    return resp;
  }

}
