//package
package com.example.hellofx;

//imports
import java.util.ArrayList;

//class
public class Inputs {

    //root variable
    Node root;

    //list constructor
    public Inputs() {
    }

    //adding a new field
    public void add(int x, int y){

        Node newNode = new Node(x,y);

         if (root==null){
            root = newNode;
         }
         else if(root.next==null){
            root.next=newNode;
         }
         else{
             Node temp = root;
             while (temp.next!=null){
                 temp=temp.next;
             }
             temp.next = newNode;
         }
    }

    //removing last field
    public void remove(){

        if(root==null){}
        else{
            Node temp=root;

            while(temp.next.next!=null){
                temp=temp.next;
            }
            
            temp.next = null;

        }
    }


    //toString to recieve value of each input. most likely not to be used and will be deleted.
    public String toString() {

        Node temp = root;
        String result = "";

        while (temp != null) {

            result = result + "(" + temp.x + "," + temp.y + ")";
            temp = temp.next;

        }

        return result;

    }





    //Node class
    public class Node {

        //Node variables
        Integer y;
        Integer x;
        Node next;

        //Node constructor
        public Node(int x, int y) {

            this.x = x;
            this.y = y;

        }


    }


}
