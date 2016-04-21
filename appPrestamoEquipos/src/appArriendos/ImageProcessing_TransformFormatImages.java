/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appArriendos;

/**
 *
 * @author Phobos
 */
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
 
/**
 *
 * @author Phobos
 */
public class ImageProcessing_TransformFormatImages{     
 
    /**
     *
     * @param bufferImage
     * @return
     */
    public Image bufferedImageToImage(BufferedImage bufferImage){
        Image imgReturn = (Image)bufferImage;
        return imgReturn;
    }
 
    /**
     *
     * @param bufferImage
     * @return
     */
    public ImageIcon bufferedImageToImageIcon(BufferedImage bufferImage){
        ImageIcon imgIconReturn = new ImageIcon(bufferImage);
        return imgIconReturn;
    }
 
    /**
     *
     * @param bufferImage
     * @return
     */
    public Icon bufferedImageToIcon(BufferedImage bufferImage){
        ImageIcon imgIcon=new ImageIcon(bufferImage);
        Icon iconReturn = (Icon)(imgIcon);
        return iconReturn;
    }
 
    /**
     *
     * @param icon
     * @return
     */
    public BufferedImage iconToBufferedImage(Icon icon){
      BufferedImage bufferImage=(BufferedImage)this.iconToImage(icon);
      return bufferImage;
    }
     
      /**
      * Converts a Icon in a Image https://groups.google.com/forum/#!topic/comp.lang.java.programmer/OI_IdebPL68
      * @param icon Icon is going to be transformed
      * @return returns an Image from a Icon
      */
    public Image iconToImage(Icon icon) {
          if (icon instanceof ImageIcon) {
              return ((ImageIcon)icon).getImage();
          } else {
              int w = icon.getIconWidth();
              int h = icon.getIconHeight();
              GraphicsEnvironment ge = 
                GraphicsEnvironment.getLocalGraphicsEnvironment();
              GraphicsDevice gd = ge.getDefaultScreenDevice();
              GraphicsConfiguration gc = gd.getDefaultConfiguration();
              BufferedImage image = gc.createCompatibleImage(w, h);
              Graphics2D g = image.createGraphics();
              icon.paintIcon(null, g, 0, 0);
              g.dispose();
              return image;
          }
      }
     
    /**
     *
     * @param icon
     * @return
     */
    public ImageIcon iconToImageIcon(Icon icon){
        ImageIcon imageIconRetur=new ImageIcon(this.iconToImage(icon));
        return imageIconRetur;
    }
     
    /**
     *
     * @param image
     * @return
     */
    public BufferedImage imageToBufferedImage(Image image){
        BufferedImage bufferReturn=(BufferedImage)image;
        return bufferReturn;
    }
     
    /**
     *
     * @param image
     * @return
     */
    public ImageIcon imageToImageIcon(Image image){
        ImageIcon imageIconReturn=new ImageIcon(image);
        return imageIconReturn;
    }
 
    /**
     *
     * @param image
     * @return
     */
    public Icon imageToIcon(Image image){
        ImageIcon imgIcon=new ImageIcon(image);
        Icon iconReturn=(Icon)imgIcon;
        return iconReturn;
    }
     
    /**
     *
     * @param imageIcon
     * @return
     */
    public BufferedImage imageIconToBufferedImage(ImageIcon imageIcon){
        BufferedImage bufferReturn=(BufferedImage)((Image)imageIcon.getImage());
        return bufferReturn;
    }
     
    /**
     *
     * @param imageIcon
     * @return
     */
    public Image imageIconToImage(ImageIcon imageIcon){
        Image imgReturn=(Image)imageIcon.getImage();
        return imgReturn;
    }
     
    /**
     *
     * @param imageIcon
     * @return
     */
    public Icon imageIconToIcon(ImageIcon imageIcon){
        Icon iconReturn=(Icon)imageIcon;
        return iconReturn;
    }
}
