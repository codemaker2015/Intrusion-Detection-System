/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifier_package;

/**
 *
 * @author home1
 */
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
 
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class CSV2Arff {
  /**
   * takes 2 arguments:
   * - CSV input file
   * - ARFF output file
     * @param args
     * @throws java.lang.Exception
   */
  public static void mainmenu() {
      try {
          
          // load CSV
          CSVLoader loader = new CSVLoader();
          loader.setSource(new File("F:\\Project\\Intrusion_Detection_System_MA\\KDDTrain.csv"));
          Instances data = loader.getDataSet();
          
          // save ARFF
          ArffSaver saver = new ArffSaver();
          saver.setInstances(data);
          saver.setFile(new File("F:\\Project\\Intrusion_Detection_System_MA\\KDDTrain.arff"));
//        saver.setDestination(new File("D:\\Allievo Project Details\\College_Prediction_Naive_Bayes\\college.arff"));
          saver.writeBatch();
      } catch (Exception ex) {
          Logger.getLogger(CSV2Arff.class.getName()).log(Level.SEVERE, null, ex);
          System.out.println("error in csv2arff  "+ex);
      }
  }
}