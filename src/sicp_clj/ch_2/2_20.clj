(ns sicp-clj.ch-2.2-20
  (:require [sicp-clj.ch-2.list :refer [car, cdr, append]]))

(defn same-parity [f & r]
  (defn same-parity-it [l rs]
    (if (empty? l)
      rs
      (let [cur (car l)
            both-odd (and (odd? f) (odd? cur))
            both-even (and (even? f) (even? cur))]
        (same-parity-it (cdr l)
                (if (or both-even both-odd)
                  (append rs (list cur))
                  rs)))))
  (cons f (same-parity-it r ())))

(println (same-parity 1 2 3 4 5 6 7))
(println (same-parity 2 3 4 5 6 7))
