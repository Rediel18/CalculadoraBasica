
package Logica;

public class Calculadora {
    	private int num1;
	private int num2;
	protected int suma;
        protected int resta;
        protected int multiplicacion;
        protected int division;

	public void setNum1(int valor){
		this.num1=valor;
	}
	public void setNum2(int valor){
		this.num2=valor;
	}
	public int getRes(){
		return this.suma;
	}
	public void sumar(){
		this.suma=this.num1+this.num2;
	}
        public void restar(){
		this.resta=this.num1-this.num2;        
	}
        public void multiplicar(){
		this.multiplicacion=this.num1*this.num2;
	}
        public void dividir(){
		this.division=this.num1/this.num2;
	}
}
