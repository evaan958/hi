//Evaan J
//Jan. 5
//2d arrays

import java.util.Scanner;

public class Arrays {

//Creating global variables that could be used in all functions    
public static int rowValue ;
public static int columnValue;
int [][] cordinate = new int [rowValue][columnValue];
Scanner scanner1 = new Scanner (System.in);
public static Arrays table = new Arrays();
public static int quit=0;

public static void main (String []args) { 
 
    do{
        //Asking the system to run the code inside the method rowInput
        table.rowInput();
        System.out.println(rowValue);
        table.columnInput();
        table.table1();
        table.update();
       
    }while(rowValue!=-1);
    
}

//Creating a method that asks the user for number of rows
public int rowInput(){
    
    System.out.println ("If you would like to quit press '-1' ");
    System.out.println("choose a number of rows");
    //Setting the scanner equal to a int so it can be used later on in the code
    rowValue  = scanner1.nextInt();
    return rowValue;
}
public void columnInput(){

    System.out.println("choose a number of columns");
    columnValue  = scanner1.nextInt();   
    
}
public void table1(){
    
    int i =0;
    int [][] cordinate = new int [rowValue][columnValue];
    
    //Creating a for loop thatwould start the row vlaue from zero and keep moving upwards until the vlaue 
    //is less than the user input
    for(int w=0; w<rowValue ; w++){
        
        //Creating a for loop thatwould start the column vlaue from zero and keep moving upwards until the vlaue 
        //is less than the user input
        for(int j=0; j<columnValue ; j++){
            
            //Giving the cordinates random values
            cordinate [w][j] = (int)(Math.random()*11);
        }
    }
    
    //Pringitng a blank line to create a space between input and output
    System.out.println();
    
    for(int w=0; w<rowValue ; w++){
        for(int j=0; j<columnValue ; j++){
            
            //Printing out the column values of row "w"
            System.out.print (cordinate [w][j]+"  ");
        }
        System.out.println();
        System.out.println();
    }
        
}
public void update(){
    
    int [][] cordinate = new int [rowValue][columnValue];
    
    for(int w=0; w<rowValue ; w++){
        
        //Creating a for loop thatwould start the column vlaue from zero and keep moving upwards until the vlaue 
        //is less than the user input
        for(int j=0; j<columnValue ; j++){
            
            //Giving the cordinates random values
            cordinate [w][j] = (int)(Math.random()*11);
        }
    }
    
    System.out.println("What is the row of the cordinate you would like to change?");
    int rowUpdate = scanner1.nextInt();
    
    System.out.println("What is the column of the cordinate you would like to change?");
    int columnUpdate = scanner1.nextInt();
    
    System.out.println("What is the new value you would like to add?");
    int updateValue = scanner1.nextInt();
    
    //Setting a new value for a specific cordinate
    cordinate[rowUpdate-1][columnUpdate-1] = updateValue;
    
    System.out.println();
    for(int w=0; w<rowValue ; w++){
        for(int j=0; j<columnValue ; j++){
            System.out.print (cordinate [w][j]+"  ");
        }
        System.out.println();
        System.out.println();
    }   
}

}