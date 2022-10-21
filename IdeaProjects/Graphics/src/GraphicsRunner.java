import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
    public GraphicsRunner()
    {
        super("Robot"); // you’ll have to do this each image
        setSize(1000,1000);	// set these to values so it creates the page

        //make sure this creates the correct object type
        //for the graphic you are creating
        getContentPane().add(new Robot()); //(new filename()) for each use
        //make is visible
        setVisible(true);

        //kills the image when the closed button is hit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //main method
    public static void main( String[] args )
    {
        //creates a GraphicsRuner object
        GraphicsRunner run = new GraphicsRunner();
    }
}


