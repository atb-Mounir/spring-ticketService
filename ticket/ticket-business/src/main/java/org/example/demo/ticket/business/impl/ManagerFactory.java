package org.example.demo.ticket.business.impl;

import contract.manager.ProjetManager;
import contract.manager.TicketManager;

public class ManagerFactory {

    public ManagerFactory() {
        super();
    }

    // on renvoie désormais simplement l'attribut projetManager
    public ProjetManager getProjetManager() {
        return projetManager();
    }

    private ProjetManager projetManager() {
        return projetManager();
    }


    // Ajout d'un setter pour l'attribut projetManager
    public void setProjetManager(ProjetManager pProjetManager) {
        /**
         * ProjetManager est désormais une interface
         * La factory dépend de cette interface et non pas de l'implémentation
         */
        // ajout d'un attribut projetManager
    }

    /**
     * *****************************************************
     */

    // ajout d'un attribut ticketManager
    private TicketManager ticketManager;

    // on renvoie désormais simplement l'attribut ticketManager
    public TicketManager getTicketManager() {
        return ticketManager();
    }

    private TicketManager ticketManager() {
        return ticketManager();
    }

    // Ajout d'un setter pour l'attribut projetManager
    public void setTicketManager(TicketManager pTicketManager) {
        ticketManager = pTicketManager;
    }
}
