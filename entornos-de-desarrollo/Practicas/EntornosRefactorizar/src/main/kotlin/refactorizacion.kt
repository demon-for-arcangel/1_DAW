private const val DAW = "String"

class refactorizacion {
    class refactoricacion1 {
        fun method() {
            val list = ArrayList<Any?>()
            list.add("String")
            anotherMethod("String")
        }

        private fun anotherMethod(string: String) {}
    }
}