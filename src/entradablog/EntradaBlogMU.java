package entradablog;

/**
 * @author Maryna Ulasava
 * @version 2.3
 * @since 03/02/2020
 */
public class EntradaBlogMU {
    
	//separador es el ccarácter que separa ENTRADA DE del
	//nombre del autor

	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
    /**
     *
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
	public EntradaBlogMU(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}

    /**
     *
     * @return
     */
    @Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	

    /**
     *
     * @return
     */
	public int getId(){
		return this.id;
	}
	
	

    /**
     *
     * @return
     */
	public String getTexto(){
		return this.texto;
	}
	
	

    /**
     *
     * @return
     */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	

    /**
     *
     * @return
     */
	public String devuelveAutor(){
		return this.autor;
	}
	
	

    /**
     *
     * @param args
     */
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogMU e1=new EntradaBlogMU (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}