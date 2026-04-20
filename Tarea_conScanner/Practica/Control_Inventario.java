package Practica;

public class Control_Inventario {

    public String codigo, nombreComercial, categoria;
    private double precio;
    private int stock, stockMinimo;

    public Control_Inventario(String codigo, String nombreComercial, String categoria, double precio, int stock, int stockMinimo){
        this.codigo = codigo;
        this.nombreComercial = nombreComercial;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
    }

    public void setPrecio(double precio){
        if (precio>0){
            this.precio = precio;
        }
    }

    public void setStock(int stock){
        if(stock>=0){
            this.stock = stock;
        }
    }

    public void setStockMinimo(int stockMinimo){
        if(stockMinimo>=0){
            this.stockMinimo = stockMinimo;
        }
    }

    public double valorInventario(){
        return precio * stock;
    }

    public String estadoStock(){
        if(stock == 0){
            return "Producto agotado";
        } else if(stock < stockMinimo){
            return "Requiere reposición";
        } else {
            return "Stock suficiente";
        }
    }

    public void mostrarReporte(){
        System.out.println("---- REPORTE DE PRODUCTO ----");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombreComercial);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Stock mínimo: " + stockMinimo);
        System.out.println("Valor inventario: " + valorInventario());
        System.out.println("Estado: " + estadoStock());
    }

}
