class GuestSpeaker(val topic: String, override var subject: String): CanTeach {
    override fun teach(){
        println("A vendégelőadó a(z) ${topic} témáról tart előadást.")
    }
}