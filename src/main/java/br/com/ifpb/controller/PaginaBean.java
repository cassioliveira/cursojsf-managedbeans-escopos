package br.com.ifpb.controller;

import br.com.ifpb.model.Pagina;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author cassio
 */
@ManagedBean
//@RequestScoped //Mantém o status dos objetos até a próxima requisição ser solicitada(atualizar página, clique em botões, etc). Escopo padrão do JSF.
//@SessionScoped //Escopo que mantém o status dos objetos até o fim da sessão e cada sessão tém acessos individuais a esses dados.
//@ApplicationScoped //Escopo que mantém o status dos objetos disponíveis para toda a aplicação e os mesmos dados para todas as sessões.
public class PaginaBean {

    Pagina pagina;

    public PaginaBean() {
        pagina = new Pagina();
    }

    public void caixaAlta() {
        //Atribui o valor de nome como maiusculo para nome2
        pagina.setNome2(pagina.getNome().toUpperCase());
    }

    public void mensagemOK() {
        //Captura mensagens e retorna via Ajax.
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Minha primeira mensagem"));
    }

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

}
