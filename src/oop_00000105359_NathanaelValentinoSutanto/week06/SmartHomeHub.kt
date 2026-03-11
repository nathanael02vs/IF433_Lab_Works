package oop_00000105359_NathanaelValentinoSutanto.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n[Hub] Mematikan semua perangkat Switchable...")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}