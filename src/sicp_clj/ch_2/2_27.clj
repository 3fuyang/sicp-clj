(ns sicp-clj.ch-2.2-27
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn deep-reverse [list]
  (defn helper [l rs]
    (if (empty? l)
      rs
      (let [cur (car l)]
        (helper (cdr l)
                (cons (if (list? cur) (deep-reverse cur)
                          cur)
                      rs)))))
  (helper list nil))

(def x "((1 2) (3 (4 5)))"
  (list (list 1 2) (list 3 (list 4 5))))

(println (deep-reverse x))
