(ns sicp-clj.ch-2.2-23
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn for-each [proc items]
  (if (empty? items)
    nil
    (let [_ (proc (car items))]
      (for-each proc (cdr items)))))

(def l (list 57 321 88))
(for-each (fn [x] (println x)) l)
