import java.util.ArrayList;
import java.util.Scanner;
public class CuentaBancaria{
    private String TipoCuenta;
    private String Moneda;
    private String NumeroCuenta;
    private String NombreTitular;
    private String DocumentoIdentidad;
    private String CorreoElectronico;

    public CuentaBancaria(){
        setTipoCuenta("");
        setMoneda("");
        setNumeroCuenta("");
        setNombreTitular("");
        setDocumentoIdentidad("");
        setCorreoElectronico("");
    }

    public CuentaBancaria(String TipoCuenta, String Moneda, String NumeroCuenta, String NombreTitular, String DocumentoIdentidad, String CorreoElectronico){
        this.TipoCuenta = TipoCuenta;
        this.Moneda = Moneda;
        this.NumeroCuenta = NumeroCuenta;
        this.NombreTitular = NombreTitular;
        this.DocumentoIdentidad = DocumentoIdentidad;
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getTipoCuenta(){
        return TipoCuenta;
    }
    public String getMoneda(){
        return Moneda;
    }
    public String getNumeroCuenta(){
        return NumeroCuenta;
    }
    public String getNombreTitular(){
        return NombreTitular;
    }
    public String getDocumentoIdentidad(){
        return DocumentoIdentidad;
    }
    public String getCorreoElectronico(){
        return CorreoElectronico;
    }
    public void setTipoCuenta(String TipoCuenta){
        this.TipoCuenta = TipoCuenta;
    }
    public void setMoneda(String Moneda){
        this.Moneda = Moneda;
    }
    public void setNumeroCuenta(String NumeroCuenta){
        this.NumeroCuenta = NumeroCuenta;
    }
    public void setNombreTitular(String NombreTitular){
        this.NombreTitular = NombreTitular;
    }
    public void setDocumentoIdentidad(String DocumentoIdentidad){
        this.DocumentoIdentidad = DocumentoIdentidad;
    }
    public void setCorreoElectronico(String CorreoElectronico){
        this.CorreoElectronico = CorreoElectronico;
    }

    public static void CuentaBancaria(Scanner sc){

    ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    for(int i = 1; i <= 2; i++){

        System.out.print("Digite el Tipo de Cuenta: ");
        String TipoCuenta = sc.nextLine();

        System.out.print("Digite la Moneda: ");
        String Moneda = sc.nextLine();

        System.out.print("Digite el Numero de Cuenta: ");
        String NumeroCuenta = sc.nextLine();

        System.out.print("Digite el Nombre del Titular: ");
        String NombreTitular = sc.nextLine();

        System.out.print("Digite el Documento de Identidad: ");
        String DocumentoIdentidad = sc.nextLine();

        System.out.print("Digite el Correo Electronico: ");
        String CorreoElectronico = sc.nextLine();

        CuentaBancaria c = new CuentaBancaria(
            TipoCuenta, Moneda, NumeroCuenta,
            NombreTitular, DocumentoIdentidad, CorreoElectronico
        );

        cuentas.add(c);
    }
    System.out.println();
    for(CuentaBancaria cb : cuentas){
        System.out.println("==============================");
        System.out.println("Tipo de Cuenta: " + cb.getTipoCuenta());
        System.out.println("Moneda: " + cb.getMoneda());
        System.out.println("Numero de Cuenta: " + cb.getNumeroCuenta());
        System.out.println("Nombre del Titular: " + cb.getNombreTitular());
        System.out.println("Documento de Identidad: " + cb.getDocumentoIdentidad());
        System.out.println("Correo Electronico: " + cb.getCorreoElectronico());
        System.out.println("==============================");
    }
    System.out.println();
}


}