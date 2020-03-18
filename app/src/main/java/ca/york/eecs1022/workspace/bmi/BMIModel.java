package ca.york.eecs1022.workspace.bmi;

import ca.roumani.i2c.*;

public class BMIModel
{


     private double weight;
     private double height;

public BMIModel(String w, String h)
{
    this.weight = Double.parseDouble(w);
    this.height = Double.parseDouble(h);
}

 public String getBMI()
 {
     double index = this.weight/(this.height * this.height);
     String result = String.format("%.1f" , index);
     return result;
 }

 public String toPound()
 {
    double newWeight = (this.weight/0.454);
    double index2 = newWeight/(this.height*this.height);
    String result = String.format("%.1f", index2);
    return result;
 }


 public String toFeetInch(){

    String h = Utility.m2FtInch(this.height);
    double H= Double.parseDouble(h);
    double index3 = this.weight/(H*H);
     String result = String.format("%.1f", index3);
    return result;

 }

    public static void main(String[] args)
    {
        BMIModel myModel = new BMIModel("100", "1.8");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("45", "1.35");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("80", "1.2");
        System.out.println(myModel.getBMI());


        myModel= new BMIModel("77", "1.8");
        System.out.println(myModel.toPound());

        myModel= new BMIModel("100", "1.78");
        System.out.println(myModel.toPound());
    }





}
