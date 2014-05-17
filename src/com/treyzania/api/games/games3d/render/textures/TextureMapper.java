package com.treyzania.api.games.games3d.render.textures;

import com.treyzania.api.games.games3d.render.RenderingTexture;

public abstract class TextureMapper {

	public abstract QuadPixel[][] mapTexture(MappedQuad quad, RenderingTexture texture);
	
}
