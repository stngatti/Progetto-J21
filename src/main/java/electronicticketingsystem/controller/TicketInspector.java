package electronicticketingsystem.controller;


/**
 * Classe che descrive un controllore.
 * Questa classe � realizzata seguendo il design pattern GRASP Controller: la classe
 * rappresenta il controller del sistema, che riceve le richieste dell'utente 
 * limitandosi a delegarle alle classi che contengono i metodi per elaborarle; il sistema
 * prevede due controller per disaccoppiare la gestione dell'interfaccia testuale dedicata
 * al cliente da quella dedicata al controllore.
 * 
 * @param idInspector			- stringa che indica l'ID del controllore
 * @param password				- stringa che indica la password associata al particolare 
 * 								  controllore per poter accedere alle procedure di controllo
 *  
 */

public class TicketInspector {
	private String idInspector;
	private String password;

	/**
	 * Costruttore della classe, che si occupa di inizializzare gli attributi idInspector e password
	 * @param id				- stringa che indica l'ID del controllore
	 * @param psw				- stringa che indica la password associata a quell'ID
	 */
	public TicketInspector(String id,String psw) {
		this.idInspector=id;
		this.password=psw;
	}
	
	/**
	 * Metodo che permette di controllare che la convalida di un biglietto sia valida.
	 * @param TicketID 		- stringa che indica l'ID del biglietto di cui verificare la validit� 
	 * @return true 		- se il biglietto � valido, false altrimenti
	 */
	public boolean inspection(String TicketID) {
		PersistenceFacade pf = PersistenceFacade.getInstance();
		return pf.Inspection(TicketID, idInspector);
	}
	
	/**
	 * Metodo get che permette di ottenere l'ID di un controllore
	 * @return idInspector	- stringa che indica l'ID del controllore
	 */
	public String getIdInspector() {
		return this.idInspector;
	}
	
	/**
	 * Metodo get che permette di ottenere la password di un controllore
	 * @return password	   - stringa che indica la password del controllore
	 */
	public String getPassword(){
		return this.password;
	}
	
}
