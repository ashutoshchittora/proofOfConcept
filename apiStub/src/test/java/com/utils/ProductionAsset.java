package com.utils;
import java.util.List;

class ProductionAsset {
	private List<Images> images;

	private Video video;

	private SpinSet spinSet;

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public List<Images> getImages() {
		return this.images;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Video getVideo() {
		return this.video;
	}

	public void setSpinSet(SpinSet spinSet) {
		this.spinSet = spinSet;
	}

	public SpinSet getSpinSet() {
		return this.spinSet;
	}
}
