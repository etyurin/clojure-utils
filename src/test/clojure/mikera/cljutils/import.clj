(ns mikera.cljutils.import) 

(def clone-foo
  "Cloneable value that stays in the import namespace")

(def import-foo 
  "Docstring for import-foo in mikera.cljutils.import namespace" 10)

(def import-bar 
  "Docstring for import-foo in mikera.cljutils.import namespace" 5)

(def this-foo
  "Imported value that should get overrideen by with-environment test"
  1000000)

(defn import-func
  "Docstring for import-func in mikera.cljutils.import namespace" 
  ([]
    0)
  ([x]
    1))

(defmacro import-macro
  "Docstring for import-macro in mikera.cljutils.import namespace" 
  ([]
    "import-macro called with zero args")
  ([x]
    "import-macro called with one arg"))