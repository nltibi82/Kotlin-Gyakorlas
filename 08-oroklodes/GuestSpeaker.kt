class GuestSpeaker(val topic: String, override val subject: String): CanTeach {
    override fun teach(){
        println("A vendégelőadó a(z) ${topic} témáról tart előadást.")
    }
}