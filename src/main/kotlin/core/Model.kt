package core

import graph.Renderable

class Model(private val parts: Map<Material, Mesh>) : Renderable {
    override fun render(device: Device) {
        parts.forEach { (material, mesh) ->
            device.material = material
            mesh.render(device)
        }
    }
}
