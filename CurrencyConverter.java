import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class CurrencyConverter extends Application
{
   @Override
   public void start(Stage primaryStage)
   {
       Label l1=new Label("");
       Label l1_=new Label("");
       Label l2=new Label("Currency");
       Label l2_=new Label("Converter");
       l2.setTextFill(Color.web("#000000"));
       l2.setFont(Font.font("Times New Roman",FontWeight.BOLD,30));
       l2_.setTextFill(Color.web("#000000"));
       l2_.setFont(Font.font("Times New Roman",FontWeight.BOLD,30));
       l2_.setPadding(new Insets(0, 0, 15, 0));
       Label l3=new Label("US Dollars");
       l3.setPadding(new Insets(0, 0, 20, 0));
       Label l4=new Label("Indian Rupee");
       Label l5=new Label("EU Euro");
       Label l6=new Label("British Pounds");
       Label l7=new Label("Japanese Yen");
       Label l8=new Label("Pakistani Rupee");
       Label l9=new Label("Bangladeshi Taka");
       //Label 20=new Label("Pakistani Rupee");


       TextField t1=new TextField();
       TextField t2=new TextField();
       t2.setDisable(true);
       t2.setStyle("-fx-control-inner-background: #808080");
       TextField t3=new TextField();
       t3.setDisable(true);
       t3.setStyle("-fx-control-inner-background: #808080");
       TextField t4=new TextField();
       t4.setDisable(true);
       t4.setStyle("-fx-control-inner-background: #808080");
       TextField t5=new TextField();
       t5.setDisable(true);
       t5.setStyle("-fx-control-inner-background: #808080");
       TextField t6=new TextField();
       t6.setDisable(true);
       t6.setStyle("-fx-control-inner-background: #808080");
       TextField t7=new TextField();
       t7.setDisable(true);
       t7.setStyle("-fx-control-inner-background: #808080");
       TextField t8=new TextField();
       t8.setDisable(true);
       t8.setStyle("-fx-control-inner-background: #808080");
       Button bt1=new Button("Convert");
       bt1.setFont(new Font("Arial",24));
       bt1.setTextFill(Color.web("white"));
       bt1.setStyle("-fx-background-color: green; ");
       bt1.setMinWidth(160);
       bt1.setOnAction((event)->
       {
           if(t1.getText().equals("")==false)
           {
               String str=t1.getText();
               str=str.substring(str.indexOf('$')+1).trim();  
               t2.setDisable(false);
               t3.setDisable(false);
               t4.setDisable(false);
               t5.setDisable(false);
               t6.setDisable(false);
               t7.setDisable(false);  
               t8.setDisable(false);            
               t2.setStyle("-fx-control-inner-background: #FFFFFF");
               t3.setStyle("-fx-control-inner-background: #FFFFFF");
               t4.setStyle("-fx-control-inner-background: #FFFFFF");
               t5.setStyle("-fx-control-inner-background: #FFFFFF");
               t6.setStyle("-fx-control-inner-background: #FFFFFF");
               t7.setStyle("-fx-control-inner-background: #FFFFFF");
               t8.setStyle("-fx-control-inner-background: #FFFFFF");
               double val=Double.parseDouble(str);      
               double val1=val*74.8134;
               double val2=val* 0.83259;
               double val3=val* .71848;
               double val4=val*108.57;
               double val5=val*152.67;
               double val6=val*85.12;
               double val7=val*152.778;
               DecimalFormat df = new DecimalFormat("#.00");
               df.setGroupingUsed(true);
               df.setGroupingSize(3);  
               t2.setText("Rs."+df.format(val1));
               t3.setText(df.format(val2)+" \u20ac");
               t4.setText("\u00a3"+df.format(val3));
               t5.setText("\u00a5 "+df.format(val4));
               t6.setText("\u20a9 "+df.format(val5));
               t7.setText("\u20a9 "+df.format(val6));
               t8.setText("\u20a9 "+df.format(val7));
           }
       });
       t1.addEventHandler(KeyEvent.KEY_PRESSED, ev ->
       {
           if (ev.getCode() == KeyCode.ENTER)
           {
               bt1.fire();
               ev.consume();
           }
       });
       Button bt2=new Button("Clear");
       bt2.setFont(new Font("Arial",24));
       bt2.setTextFill(Color.web("black"));
       bt2.setStyle("-fx-background-color: yellow; ");
       bt2.setMinWidth(160);
       bt2.setOnAction((event)->
       {
           t2.setStyle("-fx-control-inner-background: #808080");
           t3.setStyle("-fx-control-inner-background: #808080");
           t4.setStyle("-fx-control-inner-background: #808080");
           t5.setStyle("-fx-control-inner-background: #808080");
           t6.setStyle("-fx-control-inner-background: #808080");
           t7.setStyle("-fx-control-inner-background: #808080");
           t8.setStyle("-fx-control-inner-background: #808080");
           t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");
           t5.setText("");
           t6.setText("");
           t7.setText("");
           t8.setText("");
           t2.setDisable(true);
           t3.setDisable(true);
           t4.setDisable(true);
           t5.setDisable(true);
           t6.setDisable(true);
           t7.setDisable(true);
           t8.setDisable(true);
       });
       Button bt3=new Button("Exit");
       bt3.setFont(new Font("Arial",24));
       bt3.setTextFill(Color.web("white"));
       bt3.setStyle("-fx-background-color: red; "); 
       bt3.setMinWidth(160);
       bt3.setOnAction((event)->
       {
           System.exit(0);
       });
       GridPane gridPane = new GridPane();
       gridPane.setVgap(5);
       gridPane.setHgap(5);
       gridPane.setAlignment(Pos.CENTER);
       gridPane.add(l1, 0, 0);
       gridPane.add(l2, 1, 0);
       gridPane.add(l1_, 0, 1);
       gridPane.add(l2_, 1, 1);
       gridPane.add(l3, 0,2);
       gridPane.add(t1, 1, 2);
       gridPane.add(l4, 0, 3);
       gridPane.add(t2, 1, 3);
       gridPane.add(l5, 0, 4);
       gridPane.add(t3, 1, 4);
       gridPane.add(l6, 0, 5);
       gridPane.add(t4, 1, 5);
       gridPane.add(l7, 0, 6);
       gridPane.add(t5, 1, 6);
       gridPane.add(l8, 0, 7);
       gridPane.add(t6, 1, 7);
       gridPane.add(l9, 0, 8);
       gridPane.add(t7, 1, 8);
       //gridPane.add(l2, 0, 9);
       gridPane.add(t8, 1, 9);
       gridPane.add(bt1, 1, 10);
       gridPane.add(bt2, 1, 11);
       gridPane.add(bt3, 1, 12);
       Button btn = new Button();
       btn.setText("Say 'Hello World'");
       btn.setOnAction(new EventHandler<ActionEvent>()
       {
           @Override
           public void handle(ActionEvent event)
           {
               System.out.println("Hello World!");
           }
       });
       StackPane root = new StackPane();
       root.getChildren().add(gridPane);
       Scene scene = new Scene(root, 300, 460);
       primaryStage.setTitle("JavaFX GUI");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
   public static void main(String[] args)
   {
       launch(args);
   }
}
