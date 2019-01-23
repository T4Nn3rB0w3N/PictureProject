package pixLab.classes;

import java.awt.Color;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	public static void testChromakey()
	{
		Picture source = new Picture("picture name");
		Picture background = new Picture("other picture name");
		source.explore();
		background.explore();
		source.chromakey(background, Color.WHITE);
		source.explore();
	}
	
	public static void testSteganography()
	{
		Picture source = new Picture("picture name");
		Picture message = new Picture("hidden picture name");
		source.explore();
		message.explore();
		source.hidePicture(message);
		source.explore();
		source.revealPicture();
		source.explore();
	}
	
	public static void testShift()
	{
		Picture source = new Picture("seagull.jpg");
		source.explore();
		source.shiftLeftRight(90);
	}
	
	/** Method to test zeroBlue */
	public static void testZeroBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
  
  /** Method to test zeroRed */
  public static void testZeroRed()
  {
	  Picture arch = new Picture("arch.jpg");
	  arch.explore();
	  arch.zeroRed();
	  arch.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVertical from Right to Left */
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture blueMotorcycle = new Picture("blueMotorcycle.jpg");
	  blueMotorcycle.explore();
	  blueMotorcycle.mirrorVerticalRightToLeft();
	  blueMotorcycle.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture redMotorcycle = new Picture("redMotorcycle.jpg");
	  redMotorcycle.explore();
	  redMotorcycle.mirrorHorizontal();
	  redMotorcycle.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testGlitchy()
  {
	  Picture butterfly = new Picture("butterfly1.jpg");
	  butterfly.GlitchyRed();
	  butterfly.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testZeroRed();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    testGlitchy();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}