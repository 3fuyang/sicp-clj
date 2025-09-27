(ns sicp-clj.ch-1.1-34)

(defn f [g] (g 2))

;; perversely
(f f)
;; (f 2)
;; Execution error: 2 is not a function
