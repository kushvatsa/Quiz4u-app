

package onlineexamintion;

import java.awt.Image;

public class BackgroundPanel extends javax.swing.JPanel{
    Image image;
    public BackgroundPanel(String image){
        try{
            this.image = (new javax.swing.ImageIcon(getClass().getResource("images/"+image))).getImage();
            
        }catch(Exception e){/*handled in paintComponent()*/}
    }
    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        if(image != null) g.drawImage(image, (this.getWidth()/2) - (image.getWidth(this) / 2),(this.getHeight()/2) - (image.getHeight(this) / 2),image.getWidth(this),image.getHeight(this),this); //(image,location x, location y, size x, size y)
    }
}
