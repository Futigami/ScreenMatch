package br.com.futigami.screenmatch.principal;

import br.com.futigami.screenmatch.model.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = sc.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=de25df5";

        HttpClient client = HttpClient.newHttpClient();
        //Criar a request, mas necessario realizar um envio da request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        //Para isso, criamos um HttpResponse
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //Imprime o corpo da resposta
        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        System.out.println(meuTitulo);
    }
}
