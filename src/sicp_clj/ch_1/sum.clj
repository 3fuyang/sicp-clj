(ns sicp-clj.ch-1.sum)

;; both term and next are procedures
(defn sum "Sigma[i = a, b] term(x)" [term a next b]
  (if (> a b)
    0
    (+ (term a)
       (sum term (next a) next b))))

(defn cube [x]
  (* x x x))

(defn sum-cubes [a b]
  (sum cube a inc b))

(defn sum-integers [a b]
  (sum identity a inc b))

(defn pi-sum "Calculates 8th of pi]" [a b]
  (defn pi-term [x]
    (/ 1.0 (* x (+ x 2))))
  (defn pi-next [x]
    (+ x 4))
  (sum pi-term a pi-next b))

(defn integral [f a b dx]
  (defn add-dx [x]
    (+ x dx))
  (* (sum f (+ a (/ dx 2.0)) add-dx b) dx))
