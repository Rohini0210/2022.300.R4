
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;

public class FinalGraph_BW extends JFrame
{

    public FinalGraph_BW( String chartTitle)
    {
       // super(applicationTitle);
        
         JFreeChart xylineChart = ChartFactory.createXYLineChart(
         chartTitle ,
         "Cloudlets" ,
         "%" ,
         createDataset() ,
         PlotOrientation.VERTICAL ,
         true , true , false);  
         
         ChartPanel chartPanel = new ChartPanel( xylineChart );
         chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
         final XYPlot plot = xylineChart.getXYPlot( );
         
      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
      
      renderer.setSeriesPaint( 0 , Color.RED );
      //renderer.setSeriesPaint( 1 , Color.GREEN );
      //renderer.setSeriesPaint( 2 , Color.YELLOW );
      
      renderer.setSeriesStroke( 0 , new BasicStroke( 4.0f ) );
     // renderer.setSeriesStroke( 1 , new BasicStroke( 3.0f ) );
     // renderer.setSeriesStroke( 2 , new BasicStroke( 2.0f ) );
 
      plot.setRenderer( renderer ); 
      setContentPane( chartPanel ); 
        
    }
    
    private XYDataset createDataset( ) {
      final XYSeries firefox = new XYSeries( "Bandwidth Utilization (%)" );          
      firefox.add( 100 , 0.69 );          
      firefox.add( 200 , 0.81 );          
      firefox.add( 300 , 0.88 ); 
      firefox.add( 400 , 0.93 );
      
      /*final XYSeries firefox1 = new XYSeries( "Firefox" );          
      firefox1.add( 1.0 , 1.0 );          
      firefox1.add( 2.0 , 4.0 );          
      firefox1.add( 3.0 , 3.0 );
      final XYSeries firefox2 = new XYSeries( "Firefox" );          
      firefox2.add( 1.0 , 1.0 );          
      firefox2.add( 2.0 , 4.0 );          
      firefox2.add( 3.0 , 3.0 );
      final XYSeries firefox3 = new XYSeries( "Firefox" );          
      firefox3.add( 1.0 , 1.0 );          
      firefox3.add( 2.0 , 4.0 );          
      firefox3.add( 3.0 , 3.0 );*/
      
      final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( firefox );          
      
      
      return dataset;
   }
    
    
}
