package maven1;
import javax.swing.*;

public class Calculator {
	public static void main(String[] args) {

		//SwingUtilities.invokeLater(CalculatorView::new);
		//SwingUtilities.invokeNOW!!!(CalculatorView::new);
		
		CalculatorView cv = new CalculatorView();
		cv.setVisible(true);

	}
}