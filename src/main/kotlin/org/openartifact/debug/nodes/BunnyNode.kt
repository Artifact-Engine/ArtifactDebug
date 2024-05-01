package org.openartifact.debug.nodes

import glm_.vec3.Vec3
import org.openartifact.artifact.game.Component
import org.openartifact.artifact.game.nodes.DynamicBodyNode
import org.openartifact.debug.components.BunnyRenderer

class BunnyNode(position : Vec3, rotation : Vec3, scale : Vec3) : DynamicBodyNode(position, rotation, scale) {

    override fun requiredComponents(): MutableList<Component> {
        return mutableListOf(
            BunnyRenderer()
        )
    }


}