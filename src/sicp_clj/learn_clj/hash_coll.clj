(ns sicp-clj.learn-clj.hash-coll)

(def players #{"Alice" "Bob" "Kelly"})

(conj players "Fred")
(disj players "Bob" "Saul")

(contains? players "Kelly")
(conj (sorted-set) "Bravo" "Charlie" "Sigma" "Alpha")
(def new-players ["Tim" "Sue" "Greg"])
(into players new-players)

(def scores {"Fred" 1400
             "Bob" 1240
             "Angela" 1024})

(assoc scores "Sally" 0)
(assoc scores "Bob" 0)
(dissoc scores "Bob")

(get scores "Angela")

(def directions {:north 0
                 :east 1
                 :south 2
                 :west 3})

(directions :north)

(get scores "Sam" 0)

(directions :northwest -1)

(find scores "Fred")

(keys scores)

(vals scores)

(zipmap players (repeat 0))

(def new-scores {"Angela" 300 "Jeff" 900})

(merge scores new-scores)

(merge-with + scores new-scores)

(def sm (sorted-map
         "Bravo" 204
         "Alfa" 35
         "Sigma" 99
         "Charlie" 100))
(keys sm)
(vals sm)

(def person
  {:first-name "Max"
   :last-name "Verstappen"
   :age 32
   :occupation "Racer"})

(get person :occupation)

(person :occupation)

(:occupation person)

(:favorite-color person "beige")

(assoc person :occupation "Baker")

(dissoc person :age)

(def company
  {:name "WidgetCo"
   :address {:street "123 Main St"
             :city "Springfield"
             :state "IL"}})

(get-in company [:address :city])
(assoc-in company [:address :street] "303 Broadway")
(update-in company [:address :state] identity)

(defrecord Person [first-name last-name age occupation])

(def kelly (->Person "Kelly" "Keen" 32 "Programmer"))
