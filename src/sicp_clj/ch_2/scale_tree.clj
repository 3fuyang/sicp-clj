(ns sicp-clj.ch-2.scale-tree
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn scale-tree "trust me, this one is very non-trivial with clojure" [tree factor]
  (cond (number? tree) (* tree factor)
        (empty? tree) '()
        :else (cons (scale-tree (car tree) factor)
                    (scale-tree (cdr tree) factor))))

(defn scale-tree-map [tree factor]
  (map (fn [sub-tree]
         (if (list? sub-tree)
           (scale-tree-map sub-tree factor)
           (* sub-tree factor)))
       tree))

(def x (list 1
             (list 2 (list 3 4) 5)
             (list 6 7)))
(println (scale-tree x 10))
(println (scale-tree-map x 10))
