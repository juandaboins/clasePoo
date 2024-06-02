public class Cliente {
    private String nombre;
    private int dni;
    private double saldo;
    private int nroDeCuenta;
    private int cbu;
    private String alias;

    public Cliente(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0.0;
        this.nroDeCuenta = 123456;
        this.cbu = 12345678;
        this.alia = nombre+"random";
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getDni(){
        return this.dni;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double nuevoSaldo){
        this.saldo = nuevoSaldo;
    }

    public int getNroDeCuenta(){
        return this.nroDeCuenta;
    }

    public int getCbu(){
        return this.cbu;
    }

    public String getAlias(){
        return this.alias;
    }

    public void setAlias(String nuevoAlias){
        this.alias = nuevoAlias;
    }
}
