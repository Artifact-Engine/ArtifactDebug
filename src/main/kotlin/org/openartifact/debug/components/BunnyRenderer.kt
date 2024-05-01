package org.openartifact.debug.components

import glm_.vec3.Vec3
import org.openartifact.artifact.core.graphics.mesh.OBJLoader
import org.openartifact.artifact.core.graphics.component.MeshRendererComponent
import org.openartifact.artifact.utils.FileConstants
import org.openartifact.debug.nodes.BunnyNode
import java.io.File

class BunnyRenderer : MeshRendererComponent() {

    lateinit var node : BunnyNode

    init {
        mesh = OBJLoader.loadMesh(File(FileConstants.gameData(), "bunny.obj"))
    }

    override fun awake() {
        super.awake()

        node = parent as BunnyNode

        node.updateScale(Vec3(5f))
    }

    override fun update(physicsDeltaTime : Double) {
        super.update(physicsDeltaTime)

        val rotation = node.rotation

        rotation.y ++

        if (rotation.y >= 360f) {
            rotation.y = 0f
        }

        node.updateRotation(rotation)
    }

}