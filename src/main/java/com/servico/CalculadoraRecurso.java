package com.servico;

import com.entidade.Calculadora;
import com.entidade.CalculadoraResultado;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author osmar
 */
@Path("/calculadora")
public class CalculadoraRecurso {

    /**
     * Serviço de adição.
     *
     * curl
     * http://localhost:8080/webservice_calculadora_jaxrs_rest/rest/calculadora/adicao/5/2
     *
     * @param a Um valor real
     * @param b Um valor real
     * @return
     */
    @GET
    @Path("/adicao/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response adicao(@PathParam("a") double a, @PathParam("b") double b) {
        System.out.println("Executando serviço adicao.");

        //Instancia a calculadora
        Calculadora calculadora = new Calculadora();

        //Recupera o resultado
        CalculadoraResultado calculadoraResultado = calculadora.getAdicao(a, b);

        //Mensagem de retorno
        return Response.ok(calculadoraResultado, MediaType.APPLICATION_JSON).build();
    }

    /**
     * Serviço de subtração.
     *
     * curl
     * http://localhost:8080/webservice_calculadora_jaxrs_rest/rest/calculadora/subtracao/5/2
     *
     * @param a Um valor real
     * @param b Um valor real
     * @return
     */
    @GET
    @Path("/subtracao/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response subtracao(@PathParam("a") double a, @PathParam("b") double b) {
        System.out.println("Executando serviço subtracao.");

        //Instancia a calculadora
        Calculadora calculadora = new Calculadora();

        //Recupera o objeto de resultado
        CalculadoraResultado calculadoraResultado = calculadora.getSubtracao(a, b);

        //Mensagem de retorno
        return Response.ok(calculadoraResultado, MediaType.APPLICATION_JSON).build();
    }

    /**
     * Serviço de produto.
     *
     * curl
     * http://localhost:8080/webservice_calculadora_jaxrs_rest/rest/calculadora/produto/5/2
     *
     * @param a Um valor real
     * @param b Um valor real
     * @return
     */
    @GET
    @Path("/produto/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response produto(@PathParam("a") double a, @PathParam("b") double b) {
        System.out.println("Executando serviço produto.");

        //Instancia a calculadora
        Calculadora calculadora = new Calculadora();

        //Recupera o objeto de resultado
        CalculadoraResultado calculadoraResultado = calculadora.getProduto(a, b);

        //Mensagem de retorno
        return Response.ok(calculadoraResultado, MediaType.APPLICATION_JSON).build();
    }

    /**
     * Serviço de divisão.
     *
     * curl
     * http://localhost:8080/webservice_calculadora_jaxrs_rest/rest/calculadora/divisao/5/2
     *
     * @param a Um valor real
     * @param b Um valor real
     * @return
     */
    @GET
    @Path("/divisao/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response divisao(@PathParam("a") double a, @PathParam("b") double b) {
        System.out.println("Executando serviço divisao.");

        //Instancia a calculadora
        Calculadora calculadora = new Calculadora();
        
        //Recupera o objeto de resultado
        CalculadoraResultado calculadoraResultado = calculadora.getDivisao(a, b);

        //Mensagem de retorno
        return Response.ok(calculadoraResultado, MediaType.APPLICATION_JSON).build();
    }
}
