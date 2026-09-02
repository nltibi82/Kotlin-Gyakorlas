class GuestSpeaker(val topic: String): CanTeach {
    override fun teach(){
        println("A vendégelőadó a(z) ${topic} témáról tart előadást.")
    }
}