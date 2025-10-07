(ns sicp-clj.ch-2.2-4)

(defn _cons [x y]
  (fn [m] (m x y)))

(defn car [z]
  (z (fn [p q] p)))

(defn cdr [z]
  (z (fn [p q] q)))

;; (def _ (_cons 1 2))
;; -> (fn [m] (m 1 2))
;; (car _)
;; (_ (fn [p q] p))
;; ((fn [p q] p) 1 2)
;; 1
