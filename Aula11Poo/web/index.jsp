<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="model.Disciplina"%>
<%
    Disciplina POO = new Disciplina("POO", "Programação Orientada a Objetos" , "Ricardo", "SEG", "19:00");
    Disciplina BDI = new Disciplina("BDI", "Banco de Dados I" , "Simone", "SAB", "08:00");
    Disciplina ENGIII = new Disciplina("ENGIII", "Engenharia de Software III" , "Renata", "QUIN", "19:00");
    
    ArrayList<Disciplina> lista = new ArrayList<>();
    lista.add(POO); lista.add(BDI); lista.add(ENGIII);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Associação recursiva - POO</title>
    </head>
    <body>
        <h2>Lista de Disciplinas</h2>
        
        <h2>Davi Leonel Guimarães / Lucas Arantes Moya</h2>
        <%Date agora = new Date();%>
        <h2><%= agora %></h2> 
        <table border="1">
            <tr>
                <th>Disciplina</th>
                <th>Sigla</th>
                <th>Ementa</th>
                <th>DiaSemana</th>
                <th>Horário</th>
            </tr>
            <%for(Disciplina p: lista){%>
            <tr>
                <td><%= p.getNome() %></td>
                <td><%= (p.getSigla()!=null)?p.getSigla() :"" %></td>
                <td><%= (p.getNome()!=null)?p.getNome():"" %></td>
                <td><%= (p.getEmenta()!=null)?p.getEmenta():"" %></td>
                <td><%= (p.getDiaSemana()!=null)?p.getDiaSemana():"" %></td>
                <td><%= (p.getHorario()!=null)?p.getHorario() :"" %></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>