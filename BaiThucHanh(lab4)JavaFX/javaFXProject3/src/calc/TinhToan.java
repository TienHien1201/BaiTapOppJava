package calc;

import javafx.scene.control.TextField;

public class TinhToan {
    private static TextField textFile1;
    private static TextField textFile2;
    private static TextField textFile3;

    // Khởi dựng
    @SuppressWarnings("static-access")
    public TinhToan(TextField textField1, TextField textField2, TextField textField3) {
        this.textFile1 = textField1;
        this.textFile2 = textField2;
        this.textFile3 = textField3;
    }

    public void phepCong() {
        int t1, t2;
        t1 = Integer.parseInt(textFile1.getText());
        t2 = Integer.valueOf(textFile2.getText());
        textFile3.setText(String.valueOf(t1 + t2));
    }

    public void phepTru() {
        int t1, t2;
        t1 = Integer.parseInt(textFile1.getText());
        t2 = Integer.valueOf(textFile2.getText());
        textFile3.setText(String.valueOf(t1 - t2));
    }
}