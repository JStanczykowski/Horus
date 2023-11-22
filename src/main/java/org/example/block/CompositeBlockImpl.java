package org.example.block;

import java.util.*;

public class CompositeBlockImpl implements CompositeBlock{
    private String Color;
    private String Material;
    private List<Block> blocks;

    public CompositeBlockImpl() {
        this.blocks = new ArrayList<>();
    }

    public CompositeBlockImpl(String color, String material) {
        Color = color;
        Material = material;
        this.blocks = new ArrayList<>();
    }

    @Override
    public String getColor() {
        return Color;
    }

    @Override
    public String getMaterial() {
        return Material;
    }
    public void addBlock(Block block){
        blocks.add(block);
    }
    public void addListBlock(List<Block> blockList){
        blocks.addAll(blockList);
    }
    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}
