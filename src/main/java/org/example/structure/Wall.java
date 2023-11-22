package org.example.structure;

import org.example.block.Block;

import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure{
    private List<Block> blocks;
    public Wall(List<Block> blocks){
        this.blocks = blocks;
    }
    @Override
    public Optional<Block> findBlockByColor(String color) {
        Optional<Block> foundBlock = blocks.stream()
                .filter(block -> block.getColor().equalsIgnoreCase(color))
                .findFirst();

        if(foundBlock.isEmpty()) {
            System.out.println("Not found, block color :" + color);
        }
        return foundBlock;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> foundBlocks = blocks.stream()
                .filter(block -> block.getMaterial().equalsIgnoreCase(material))
                .collect(Collectors.toList());

        if(foundBlocks.isEmpty()) {
            System.out.println("Not found, block material :" + material);
        }
        return foundBlocks;
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
