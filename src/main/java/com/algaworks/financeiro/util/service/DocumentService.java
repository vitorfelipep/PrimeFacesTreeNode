package com.algaworks.financeiro.util.service;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import com.algaworks.financeiro.model.Document;

@ManagedBean(name = "documentService")
@ApplicationScoped
public class DocumentService {
     
    public TreeNode createDocuments() {
        TreeNode root = new DefaultTreeNode(new Document("PRODUTO", "MARCA", "QTDPED"), null);
         
        TreeNode documents = new DefaultTreeNode(new Document("ARROZ AGULHINHA", "TIO JOAO", "1000"), root);
        TreeNode pictures = new DefaultTreeNode(new Document("SUCO DIVER SABORES", "MARCA X", "2000"), root);
        TreeNode movies = new DefaultTreeNode(new Document("Movies", "-", "Folder"), root);
         
        TreeNode work = new DefaultTreeNode(new Document("RAMO", "-", "-"), documents);
        TreeNode work1 = new DefaultTreeNode(new Document("166", "-", "-"), work);
        TreeNode work2 = new DefaultTreeNode(new Document("PEDIDO", "-", "QTDPED"), work1);
        TreeNode work3 = new DefaultTreeNode(new Document("1245988", "-", "50"), work2);
        TreeNode work4 = new DefaultTreeNode(new Document("1245977", "-", "50"), work2);
        TreeNode work5 = new DefaultTreeNode(new Document("12459865", "-", "50"), work2);
        TreeNode primefaces = new DefaultTreeNode(new Document("PrimeFaces", "-", "Folder"), documents);
         
        //Documents
        TreeNode expenses = new DefaultTreeNode("document", new Document("Expenses.doc", "30 KB", "Word Document"), work);
        TreeNode resume = new DefaultTreeNode("document", new Document("Resume.doc", "10 KB", "Word Document"), work);
        TreeNode refdoc = new DefaultTreeNode("document", new Document("RefDoc.pages", "40 KB", "Pages Document"), primefaces);
         
        //Pictures
        TreeNode barca = new DefaultTreeNode("picture", new Document("barcelona.jpg", "30 KB", "JPEG Image"), pictures);
        TreeNode primelogo = new DefaultTreeNode("picture", new Document("logo.jpg", "45 KB", "JPEG Image"), pictures);
        TreeNode optimus = new DefaultTreeNode("picture", new Document("optimusprime.png", "96 KB", "PNG Image"), pictures);
         
        //Movies
        TreeNode pacino = new DefaultTreeNode(new Document("Al Pacino", "-", "Folder"), movies);
        TreeNode deniro = new DefaultTreeNode(new Document("Robert De Niro", "-", "Folder"), movies);
         
        TreeNode scarface = new DefaultTreeNode("mp3", new Document("Scarface", "15 GB", "Movie File"), pacino);
        TreeNode carlitosWay = new DefaultTreeNode("mp3", new Document("Carlitos' Way", "24 GB", "Movie File"), pacino);
         
        TreeNode goodfellas = new DefaultTreeNode("mp3", new Document("Goodfellas", "23 GB", "Movie File"), deniro);
        TreeNode untouchables = new DefaultTreeNode("mp3", new Document("Untouchables", "17 GB", "Movie File"), deniro);
         
        return root;
    }
}
