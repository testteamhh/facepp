package com.facerecognition.data;

import java.util.ArrayList;

import com.facerecognition.api.Face;
import com.facerecognition.api.Image;

/**
 * 
 * @author liliang
 * @date 2012-11-29
 * @desc detect return数据类型封装
 * 
 */
public class DetectReturn {
	public Image image;
	public String sessionId;
	public ArrayList<Face> faceList;
	
}
