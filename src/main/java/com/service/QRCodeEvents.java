package com.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class QRCodeEvents {

	public static void main(String[] args) throws WriterException {

		String qrcodeFilePath = "";
        try {
            int qrcodeWidth = 300;
            int qrcodeHeight = 300;
            String qrcodeFormat = "png";
            HashMap<EncodeHintType, String> hints = new HashMap<EncodeHintType, String>();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            BitMatrix bitMatrix = new MultiFormatWriter().encode("www.baidu.com", BarcodeFormat.QR_CODE, qrcodeWidth, qrcodeHeight, hints);

            BufferedImage image = new BufferedImage(qrcodeWidth, qrcodeHeight, BufferedImage.TYPE_INT_RGB);
            File QrcodeFile = new File("D:\\qrcode\\" + UUID.randomUUID().toString() + "." + qrcodeFormat);
            
            Path QrcodePath = QrcodeFile.toPath();
            
            ImageIO.write(image, qrcodeFormat, QrcodeFile);
            MatrixToImageWriter.writeToPath(bitMatrix, qrcodeFormat, QrcodePath);
            qrcodeFilePath = QrcodeFile.getAbsolutePath();
            
            System.out.println("qrcodeFilePath==" + qrcodeFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
