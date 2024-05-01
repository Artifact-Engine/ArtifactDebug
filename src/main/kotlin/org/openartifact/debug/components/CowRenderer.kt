package org.openartifact.debug.components

import org.openartifact.artifact.core.graphics.mesh.OBJLoader
import org.openartifact.artifact.core.graphics.component.MeshRendererComponent
import org.openartifact.artifact.utils.FileConstants
import org.openartifact.debug.nodes.CowNode
import java.io.File

class CowRenderer : MeshRendererComponent() {

    lateinit var node : CowNode

    init {
        mesh = OBJLoader.loadMesh(File(FileConstants.gameData(), "cow.obj"))
    }

    override fun awake() {
        super.awake()

        node = parent as CowNode

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