package com.virtualartgallery.dao;

public interface IVirtualArtGalleryService {
	
	void addArtworkToFavorite();
	void removeArtworkFromFavorite();
	void getUserFavoriteArtworks();

}
