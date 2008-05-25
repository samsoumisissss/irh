package web.formations;

import java.text.SimpleDateFormat;

import org.displaytag.decorator.TableDecorator;

import entities.SessionFormation;


public class ListeSessionFormationsDecorator extends TableDecorator {
	
	public String getEditLink()
    {
        SessionFormation session = (SessionFormation)this.getCurrentRowObject();
        
        return "<a href=\"modif_session_formation.htm?id_session_formation=" + session.getId() + "&id_plan_formation=" + session.getPlanFormation().getId() + "\">" +
        			"<img src=\"./images/edit.png\" alt=\"Modifier la session de formation\"/>" +
        			"</a>";
    }
	
	public String getSupprLink()
    {
		SessionFormation session = (SessionFormation)this.getCurrentRowObject();
        
        return "<a href=\"suppr_session_formation.htm?id_session_formation=" + session.getId() + "&id_plan_formation=" + session.getPlanFormation().getId() + "\" onclick=\"javascript: return confirm('Voulez-vous supprimer cette session de formation ?');\">" +
        			"<img src=\"./images/delete.png\" alt=\"Supprimer la session de formation\"/>" +
        			"</a>";
    }
	
	public String getSubscribeLink()
	{
		SessionFormation session = (SessionFormation)this.getCurrentRowObject();
        
        return "<a href=\"liste_inscriptions.htm?id_session_formation=" + session.getId() + "&id_plan_formation=" + session.getPlanFormation().getId() + "\">" +
					"<img src=\"./images/add_user.png\" alt=\"Inscrire quelqu'un la session de formation\"/>" +
					"</a>";
    }
	
	public String getNbParticipants()
	{
		//SessionFormation session = (SessionFormation)this.getCurrentRowObject();
		//TODO : Calculer le nombre de participant a la session
		return "TODO";
	}
	
	public String getprixTotal()
	{
		//SessionFormation session = (SessionFormation)this.getCurrentRowObject();
		//TODO : Calculer le prix total de la session
		
		return "TODO";
	}
	
	public String getDateDebutShortFormat()
	{
		SessionFormation session = (SessionFormation)this.getCurrentRowObject();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		return dateFormat.format(session.getDateDebut());
	}
	
	public String getDateFinShortFormat()
	{
		SessionFormation session = (SessionFormation)this.getCurrentRowObject();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		return dateFormat.format(session.getDateFin());
	}
}