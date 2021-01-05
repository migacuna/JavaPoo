package Exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.Cliente;
import Modelo.DetalleOrden;
import Modelo.Producto;
import Modelo.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int p;
		boolean tt=true;
		do {
			System.out.println("Menu Prueba Java");
			System.out.println("[1] Crea Orden de compra ");
			System.out.println("[2] Valida Contraseña ");
			System.out.println("[3] valida Usuario y Contraseña ");
			System.out.println("[4] Salir");
			p=sc.nextInt();
			if(p==1) {
				ExecPregunta1();
			}
			if(p==2) {
				ExecPregunta2();
			}
			if(p==3) {
				ExecPregunta3();
			}
			if(p==4) {
				System.out.println("Game Over");
				tt=false;
			}
		}while(tt);
	}
	
	//Pregunta 1 Crear Orden de Compra
	public static void ExecPregunta1() {
		
		DetalleOrden dtOrden = new DetalleOrden();
		Cliente cliente = new Cliente();
	
		List<Producto> productos = new ArrayList<Producto>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean st = true;
		String p;
		
		System.out.println("*** Datos Cliente ***");
		System.out.println("Ingrese nombre: ");
		cliente.setNombre(sc.nextLine());
		System.out.println("Ingrese Direccion: ");
		cliente.setDireccion(sc.nextLine());
		
		do {
			Producto producto = new Producto();
			System.out.println("*** Ingrese un producto ***");
			System.out.println("Nombre producto: ");
			producto.setNombreProducto(sc.nextLine());
			System.out.println("Codigo Producto: ");
			producto.setCodigo(sc.nextLine());
			System.out.println("Precio: ");
			producto.setPrecio(Integer.parseInt(sc.nextLine()));
			System.out.println("Cantidad: ");
			producto.setCantidad(Integer.parseInt(sc.nextLine()));
			
			productos.add(producto);
			
			System.out.println("Digite [1] Continuar, [0] Salir");
			p=sc.nextLine();
			if(p.equals("0")) {
				
				st=false;
			}
			
		}while(st);
		
		dtOrden.setCliente(cliente);
		dtOrden.setProductos(productos);
		
		int total=0;
		for (Producto temp: productos) {
			total = total + temp.getPrecio() * temp.getCantidad();
		}
		System.out.println(dtOrden);
		System.out.println("Total: " + total);
	}

	//Pregunta 2 Valida Contraseña
	public static void ExecPregunta2() {
		
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		int contMa=0, contMi=0, contNu=0;
		
		System.out.println("Contraseña: ");
		usuario.setPass(sc.nextLine());
		if(usuario.getPass().length()>=10) {
			for(char letra : usuario.getPass().toCharArray()) {
				if(letra>=97 && letra <= 122) {
					//if(Character.isLowercase(letra))  valida Minuscula
					contMi++;
				}
				if(letra>=65 && letra <= 90) {
					//is(Character.isUpperCase(letra)) valida Mayuscula
					contMa++;
				}
				if(letra>=48 && letra <= 57) {
					//if(Character.isDigit(letra)) valida Numeros
					contNu++;
				}
				
			}
			if(contMi >=3 && contMa >=4 && contNu >=3) {
				System.out.println("Contraseña Fuerte");
			}else {
				System.out.println("Contraseña Debil");
			}
		}else {
		System.out.println("Contraseña Debil < 10");
		}
	}
	
	//Pregunta3 Validad usuario y contraseña
	public static void ExecPregunta3 () {
		
		Scanner sc = new Scanner(System.in);
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(new Usuario("camila", "QWERtyu123"));
		usuarios.add(new Usuario("patricia", "QWERrty123"));
		usuarios.add(new Usuario("david", "QWERrty123"));
		int st=0;
		boolean tt = true;
		Usuario usuario = new Usuario();
		do {
			System.out.println("Usuario: ");
			usuario.setUser(sc.nextLine());
			System.out.println("Contraseña: ");
			usuario.setPass(sc.nextLine());
		
			for(Usuario temp : usuarios) {
				if(temp.getUser().equals(usuario.getUser())){
					if(temp.getPass().contentEquals(usuario.getPass())){
						st=0;
						break;
					}else {
						st=1;
						break;
					}
				}else {
					st=2;
				}
			}
		
			if(st==0) {
				System.out.println("Validado");
				tt=false;
			}else if(st==1){
				System.out.println("Error de Contraseña");
			}else {
				System.out.println("Usuario no existe");
			}
		}while(tt);
	}
}
