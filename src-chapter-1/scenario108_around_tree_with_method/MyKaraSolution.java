package scenario108_around_tree_with_method;
import kara.greenfoot.Kara;
/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara: <p>
 * 
 * <i>MyKara ist eine Unterklasse von Kara. Sie erbt damit alle Methoden der Klasse Kara:</i> <p>
 * 
 * Actions:     move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors:     onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKaraSolution extends Kara {
	
    /**
     * In the 'act()' method you can write your program for Kara <br>
     * <i>In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden</i>
     */
	public void act() {
		move();
		goAroundTree();
		goAroundTree();
		move();
		goAroundTree();
		removeLeaf();
		
		stop();
	}

	public void goAroundTree() {
		turnLeft();
		move();
		turnRight();
		move();
		move();
		turnRight();
		move();
		turnLeft();
	}
	
}
